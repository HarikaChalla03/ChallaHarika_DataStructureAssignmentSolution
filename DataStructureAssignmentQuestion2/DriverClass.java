package com.greatlearning.BST_into_SkewedTree;

import java.util.Scanner;

import com.greatlearning.BST_into_SkewedTree.BST_into_skewedTree.Node;

public class DriverClass {

	public static void main(String[] args) {
		Scanner sc = new Scanner( System.in ) ;
        int value ;
        Node root = null ;
        Node result = null ;
        int[] arr = { 10, 30, 50, 55, 60 } ;
        for ( int i = 0; i < arr.length; i++ ) {
          value = arr[i] ;
          System.out.println(" \nInsert value at " + (i+1) + " : " ) ;
          value = arr[i] ;
          if ( root == null ) {
             root = BST_into_skewedTree.insert( root, value ) ;
             } 
             else {
             result = BST_into_skewedTree.insert( root, value ) ;
             if ( result.key == value )
             i -= 1 ;
             }
        System.out.println() ;
        System.out.println(" Inorder of Binary Tree\n ") ;
        BST_into_skewedTree.Inorder( root ) ;
        }
        
        System.out.println(" \n\n right skewed tree values are : ") ;
        BST_into_skewedTree.leftNodes( root ) ;
        sc.close() ;
       }
}


