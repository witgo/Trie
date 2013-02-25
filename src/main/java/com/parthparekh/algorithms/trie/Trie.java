package com.parthparekh.algorithms.trie;

import java.util.Set;

/**
 * Interface for Trie - defines the basic functions that a Trie should have
 *
 * @author: Parth Parekh (parthparekh [at] gatech [dot] edu)
 */
public interface Trie {

    /*
     * adds a string to trie
     *
     * @param wordString - string you want to add to Trie
     * @return returns true if the add was successful, false otherwise
     */
    public boolean addString(String wordString);

    /*
     * removes a string from trie
     *
     * @param wordString - string you want to remove from Trie
     * @return returns true if the remove was successful, false otherwise
     */
    public boolean removeString(String wordString);

    /*
     * search a string from trie
     *
     * @param wordString - string you want to search from Trie
     * @return returns true if the search was successful, false otherwise
     */
    public boolean hasString(String wordString);

    /*
     * returns set of all the characters from trie that follows given prefixString
     *
     * @param prefixString - string that is prefix to all possible characters returned by this function
     * @return returns set of all the characters from trie that begin with prefixString, null otherwise
     */
    public Set<Character> getNextCharacters(String prefixString);
}
