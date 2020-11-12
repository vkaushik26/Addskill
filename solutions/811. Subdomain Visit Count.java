class Solution {
    public List<String> subdomainVisits(String[] cpdomains) {
     if(cpdomains == null || cpdomains.length == 0) return new ArrayList<>();
        Map<String, Integer> map = new HashMap<>();
        for(String domain : cpdomains) {
            addToMap(domain, map);
        }
        
        List<String> res = new ArrayList<>();
        for(String key : map.keySet()) {
            Integer count = map.get(key);
            res.add(count + " " + key);
        }
        return res;
    }
      public void addToMap(String domain, Map<String, Integer> map) {
        int count = Integer.parseInt(domain.split(" ")[0]);
        String subDomain = domain.split(" ")[1];
          System.out.println(subDomain);
        while(subDomain.length() > 0) {
            map.put(subDomain, map.getOrDefault(subDomain, 0) + count);
            System.out.println(map);
            if(!subDomain.contains("."))
                break;
            subDomain = subDomain.substring(subDomain.indexOf('.') + 1);
        }
    }
}
