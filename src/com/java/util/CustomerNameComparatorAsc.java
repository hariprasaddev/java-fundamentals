package com.java.util;

import com.java.Collections.map.Customer;

import java.util.Comparator;

public class CustomerNameComparatorAsc implements Comparator<Customer> {
    @Override
    public int compare(Customer o1, Customer o2) {
        return o1.name.compareTo(o2.name);
    }
}

