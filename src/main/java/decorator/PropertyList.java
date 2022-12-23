package decorator;

import java.util.*;

public class PropertyList  {
    private String name;
    private ArrayList<PropertyList> list;

    {
        list = new ArrayList<>();
    }

    public void add(String properties) {
        if (properties.contains(".")) {
            int dotIndex = properties.indexOf(".");
            String nameFromString = properties.substring(0, dotIndex);

            PropertyList firstNext = new PropertyList();
            String secondPartOfString = properties.substring(dotIndex + 1);

            if (list == null) {
                list = new ArrayList<>();
            }
            if (name == null) {
                name = nameFromString;
            } else {
                String nextName;
                if (secondPartOfString.contains(".")){
                    nextName = secondPartOfString.substring(0, secondPartOfString.indexOf("."));
                }
                else {
                    nextName = secondPartOfString;
                }
                for (PropertyList wrapper : list) {
                    String wrapperName = wrapper.getName();
                    if (wrapperName.equals(nextName)) {
                        wrapper.add(secondPartOfString);
                        return;
                    }
                }
            }
            firstNext.add(properties.substring(dotIndex + 1));
            list.add(firstNext);
        } else {
            name = properties;
        }
    }

    public String getName() {
        return name;
    }

    public void showList() {
        System.out.println(name);
        for (var subList : list) {
            subList.showList();
        }
    }



}
