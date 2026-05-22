package com.java.util;

import com.java.Collections.map.Customer;

import java.util.Comparator;

public class CustomerIdComparatorAse implements Comparator<Customer> {
        @Override
        public int compare (Customer o1, Customer o2){
        return Integer.compare(o1.id, o2.id);
    }
    }

