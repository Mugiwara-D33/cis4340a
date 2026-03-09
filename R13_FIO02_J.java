// Rule 13 Detect and handle file related errors
// do not ignore return values

File file = new File("file");
if (!file.delete()) {
  // Deletion failed, handle error
}

Path file = new File(args[0]).toPath();
try {
  Files.delete(file);
} catch (IOException x) {
  // Deletion failed, handle error
}
