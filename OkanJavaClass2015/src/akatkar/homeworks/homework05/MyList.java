/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package akatkar.homeworks.homework05;

import java.util.Iterator;

/**
 *
 * @author akatkar
 */
public class MyList implements Iterable {

    private Object[] a;
    private int size;

    public MyList(Object[] a) {
        this.a = a;
        this.size = a.length;
    }

    
    public Iterator iterator() {
        return new MyIterator();
    }

    public class MyIterator implements Iterator {

        private int pos = 0;

        public boolean hasNext() {
            return pos < size;
        }

        public Object next() {
            return a[pos++];
        }
    }
}
