package br.com.gbellia.renamer;

import br.com.gbellia.classes.RenameFiles;


public class FileRenamer {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		RenameFiles rf = new RenameFiles();
		/* Defines the path to rename files. Program actual directory setted */
		rf.setPath(".");
		rf.renameFiles();
		
	}

}
