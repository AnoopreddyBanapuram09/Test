package com.project.demo.hello;

import com.project.demo.hello.interfaces.IGreeter;
import org.springframework.stereotype.Service;

import java.util.*;
import java.util.stream.Collectors;

@Service
public class Greeter implements IGreeter {
    public String sayHello() {

        //Lambda Expression
        /*ArrayList<String> numbers = new ArrayList<>();
        numbers.add("2");
        numbers.add("21");
        numbers.add("211");
        numbers.add("2111");
        numbers.forEach( (n) -> {System.out.println(n + " OK");});*/

        //Streams List using sorting
        /*List<String> numbers = new ArrayList<>();
        numbers.add("Reflection");
        numbers.add("Collection");
        numbers.add("Stream");
        numbers.add("1");
        List<String> result = numbers.stream().sorted().collect(Collectors.toList());
        System.out.println(result.get(2));

        Arrays.asList(10, 23, -4, 0, 18).stream().sorted().forEach(System.out::println);

        //Streams List using map
        List<String> names = Arrays.asList("anoop", "red", "banapuram");
        List<String> newNames = names.stream().map(String::toUpperCase).collect(Collectors.toList());
        System.out.println("upper case list is : " + newNames);*/

        //Streams Map
        /*Map<String, Integer> mapList = new HashMap<>();
        mapList.put("anoop", 123);
        mapList.put("anoopre", 1234);
        mapList.put("anooprebana", 12345);

        Map<Integer, String> newMapList = mapList.entrySet().stream().collect(Collectors.toMap(Map.Entry::getValue, Map.Entry::getKey));
        System.out.println("newMapList is : " + newMapList);

        Map<Integer, String> newMapList2 = new HashMap<>();

        for(Map.Entry<String, Integer> mapEntry : mapList.entrySet()){
            newMapList2.put(mapEntry.getValue(), mapEntry.getKey());
        }
        System.out.println("newMapList2 is : " + newMapList2);*/

        List<Integer> inputs = Arrays.asList(1,2,3,4,5,6,7,8,9,10,11,12,13,14,15);
        for(int i=0; i< inputs.size(); i++){
            if(inputs.get(i) % 3== 0 && inputs.get(i)%5 == 0) {
                System.out.println("ab" + inputs.get(i));
            }
            else if (inputs.get(i) % 3== 0 ) {
                System.out.println("a" + inputs.get(i));
            }
            else if (inputs.get(i) % 5== 0 ) {
                System.out.println("b" + inputs.get(i));
            }
        }

        return "Greetings says 1235 Hello Good Morning!";
    }
}
