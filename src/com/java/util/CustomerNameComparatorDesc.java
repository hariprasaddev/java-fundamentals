package com.java.util;

import com.java.Collections.map.Customer;

import java.util.Comparator;

public class CustomerNameComparatorDesc implements Comparator<Customer> {
    @Override
    public int compare(Customer o1, Customer o2) {
        return o2.name.compareTo(o1.name);
    }
}

