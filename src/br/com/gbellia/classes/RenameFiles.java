package br.com.gbellia.classes;

import java.io.File;


public class RenameFiles {
	
	private String path;
	private String files;
	/**
	 * This method reads all files inside a given folder (running application by default) and renames
	 * non word charcters to blank.
	 */
	public void renameFiles() {
		
		File folder = new File(path);
		File[] listOfFiles = folder.listFiles();
		for (int i = 0; i < listOfFiles.length; i++) {
			if (listOfFiles[i].isFile()) {
				if(listOfFiles[i].getName().matches(".*[^a-zA-Z_0-9].*\\..*")) {
					String str = listOfFiles[i].getName().replaceAll("[^\\.&&[^a-zA-Z_0-9]]", "");
					File newName = new File(str);
					listOfFiles[i].renameTo(newName);
				}
				files = listOfFiles[i].getName();
				System.out.println(files);
			}
		}
	}

	public String getPath() {
		return path;
	}

	public void setPath(String path) {
		this.path = path;
	}
	

}
