package com.yash.java8.stream_api.problem1;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.stream.Collectors;

public class Pilot {

	public static void main(String[] args) {
//		List<Item> itemList=Arrays.asList(
//							new Item(1, "Gyzer", LocalDateTime.of(2022, 9, 06,13,14), LocalDateTime.of(2023, 9, 06,13,14), 2000),
//							new Item(2, "fan", LocalDateTime.of(2022, 9, 7,10,12), LocalDateTime.of(2023, 9, 7,10,12), 4000),
//							new Item(2, "tube",LocalDateTime.of(2022, 9, 7,1,1), LocalDateTime.of(2023, 9, 7,1,1), 120),
//							new Item(2, "WaterBottle", LocalDateTime.of(2022, 9, 7,13,14), null, 20)
//							);
		
		   
        List<Item> l=new ArrayList<>();
        l.add(new Item(1, "Fan",LocalDateTime.of(2022, 4, 23, 4, 30), LocalDateTime.of(2023, 4, 23, 4, 30), 2000));
        l.add(new Item(2, "Cooler",LocalDateTime.of(2020, 5, 20, 8, 00), LocalDateTime.of(2021, 5, 20, 8, 00), 4000));
        l.add(new Item(3, "monaco",LocalDateTime.of(2021, 7, 21, 7, 20), LocalDateTime.of(2022, 7, 21, 7, 20), 8000));
        l.add(new Item(4, "borbon",LocalDateTime.of(2019, 9, 12, 6, 37), LocalDateTime.of(2020, 9, 12, 6, 37), 3000));
        l.add(new Item(5, "derymilk",LocalDateTime.of(2019, 9, 12, 6, 37), LocalDateTime.of(2020, 9, 12, 6, 37), 3000));
        l.add(new Item(6, "water botal",LocalDateTime.of(2019, 9, 12, 6, 37),null, 10000));
    
        System.out.println("Find average of the given price of item");
        
        float price=(float) l.stream().mapToDouble(Item::getPrice).average().orElse(Double.NaN);
        System.out.println(price);
    
        System.out.println("Find the highest price of the given item");
        
        Item max=l.stream().map(v->v).max(Comparator.comparing(Item::getPrice)).orElseThrow(NoSuchElementException::new);
        System.out.println(max);
        
        System.out.println("Find the lowest price of the given item");
        
        Item min=l.stream().map(v->v).min(Comparator.comparing(Item::getPrice)).orElseThrow(NoSuchElementException::new);
        System.out.println(min);
    
        System.out.println("Find the item thoes have not Expiry date");
    
        List<Item> list=l.stream().filter(v->v.getDoe()==null).collect(Collectors.toList());
        System.out.println(list);
    
        System.out.println("store the name and price from list to set");
        
        Set<Item> value=l.stream().map(a->new Item(a.getIname(),a.getPrice())).collect(Collectors.toSet());
        for(Item i:value) {
        System.out.println(i.getIname()+" "+i.getPrice());
        }
        
        System.out.println("remove duplicate price from list of item");
        
        l.stream().map(s->s.getPrice()).distinct().forEach(System.out::println);
		
		
	}
}
