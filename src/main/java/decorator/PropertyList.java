package decorator;

import java.util.*;

public class PropertyList  {
    private String name;
    private ArrayList<PropertyList> list;

    {
        list = new ArrayList<>();
    }

    public void add(String properties) {
        String[] splitProperties = properties.split(
                "\\.",
                properties.contains(".") ? 2 : 0
        );
        name = splitProperties[0];
        System.out.println("splitProperties:" + name);

        PropertyList propertyList = new PropertyList();

        if ((properties.contains(".") ? 2 : 0) > 0) {
            String otherProperties = splitProperties[1];

            String[] splitOtherProperties = otherProperties.split(
                    "\\.",
                    otherProperties.contains(".") ? 2 : 0
            );

            String nextProperty = splitOtherProperties[0];

            if (list.isEmpty()) {
                propertyList.add(otherProperties);
                list.add(propertyList);
            } else {
                for (var i = 0; i < list.size(); i++) {
                    if (Objects.equals(list.get(i).getName(), nextProperty)) {
                        if ((otherProperties.contains(".") ? 2 : 0) > 0) {
                            list.get(i).add(splitOtherProperties[1]);
                        }
                    } else {
                        propertyList.add(otherProperties);
                        list.add(propertyList);
                    }
                }

            }

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
