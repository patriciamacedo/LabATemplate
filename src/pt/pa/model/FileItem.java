/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pt.pa.model;

/**
 *
 * @author patriciamacedo
 */
public class FileItem extends FileContainer {

    private int size;


    public FileItem(String name, int size) throws FileManagerInvalidOperation {
        super(name);
        if(size <= 0) {
            throw new FileManagerInvalidOperation("size must  be greater then zero.");
        }
        this.size = size;
    }



    public int getSize() {
        return size;
    }


    @Override
    public String toString() {

            return super.toString()+ " ( " + size + " )";

    }


}
