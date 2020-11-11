class Solution {
    public List<List<String>> findDuplicate(String[] paths) {
        HashMap < String, List < String >> map = new HashMap < > ();
        for (String path: paths) {
            String[] values = path.split(" ");
            for (int i = 1; i < values.length; i++) {
                String[] count = values[i].split("\\(");
                count[1] = count[1].replace(")", "");
                System.out.println(count[1]);
                List < String > list = map.getOrDefault(count[1], new ArrayList <String> ());
                list.add(values[0] + "/" + count[0]);
                map.put(count[1], list);
            }
        }
        List < List < String >> res = new ArrayList < > ();
        for (String key: map.keySet()) {
            if (map.get(key).size() > 1)
                res.add(map.get(key));
        }
        return res;
    }
}
