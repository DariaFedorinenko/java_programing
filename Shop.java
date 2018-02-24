package com.company;

import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

public class Shop {
    private List<ChildGoods> childGoodsList = new LinkedList<>() ;

    public List<ChildGoods> getChildGoodsList() {
        return childGoodsList;
    }

    public void addChildGoods (ChildGoods newChildGoods){
        childGoodsList.add(newChildGoods);
    }

    public List<ChildGoods> findByAge(Age age){
        List<ChildGoods> resultChildGoods = new LinkedList<ChildGoods>();

        for (ChildGoods childgood : childGoodsList){
            if(ChildGoods.getAge().equals(age)){
                resultChildGoods.add(childgood);
            }
        }
        return resultChildGoods;
    }

    public void sortByExpiration(List<ChildGoods> resultChildGoods){

    }
}


