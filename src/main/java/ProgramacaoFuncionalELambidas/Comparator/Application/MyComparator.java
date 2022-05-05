package ProgramacaoFuncionalELambidas.Comparator.Application;

import ProgramacaoFuncionalELambidas.Comparator.Entities.Products;

import java.util.Comparator;
import java.util.Locale;

public class MyComparator implements Comparator<Products> {


    @Override
    public int compare(Products p1, Products p2) {
        return p1.getNome().toUpperCase().compareTo(p2.getNome().toUpperCase());
    }
}
