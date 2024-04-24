package com.mllukasik.robusta.util;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.stream.Collectors;

public final class Paths {

    private Paths() {
    }

    public static String getFileExtension(Path path) {
        var fileName = path.getFileName().toString();
        return fileName.substring(fileName.lastIndexOf('.'));
    }

    public static Path changeFileExtension(Path path, String fileExtension) {
        var parent = path.getParent();
        var fileName = path.getFileName().toString();
        return parent.resolve(fileName.substring(0, fileName.lastIndexOf('.')) + fileExtension);
    }

    public static void ensureDirectoryExists(Path path) throws IOException {
        if (Files.isDirectory(path)) {
            return;
        }
        if (Files.exists(path)) {
            throw new IllegalStateException("Build path exists but is not directory path");
        }
        Files.createDirectories(path);
    }

    public static String readLines(Path path) throws IOException {
        try (var reader = new FileReader(path.toFile())) {
            try (var bfReader = new BufferedReader(reader)) {
                return bfReader.lines().collect(Collectors.joining("\n"));
            }
        }
    }
}
