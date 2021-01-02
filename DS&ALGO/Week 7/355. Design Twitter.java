        for(Integer user : users.get(userId))
            for(Map.Entry<Integer,Integer> e : tweets.get(user).entrySet())
                queue.offer(e);
            
        
        for(int i = 0; i < 10 && !queue.isEmpty(); i++)
            res.add(queue.poll().getValue());
        
        return res;
    }
​
    public void follow(int followerId, int followeeId) {
​
        if(followerId == followeeId) return;
​
        if(users.get(followerId) == null){
            users.put(followerId,new HashSet<>());
            tweets.put(followerId,new HashMap<>());
        }
​
        if(users.get(followeeId) == null){
            users.put(followeeId,new HashSet<>());
            tweets.put(followeeId,new HashMap<>());
        }
​
        users.get(followerId).add(followeeId);
    }
​
    public void unfollow(int followerId, int followeeId) {
​
        if(followerId == followeeId) return;
​
        if(users.get(followerId) == null || users.get(followeeId) == null) return;
        
        users.get(followerId).remove(followeeId);
    }
}
/**
 * Your Twitter object will be instantiated and called as such:
 * Twitter obj = new Twitter();
 * obj.postTweet(userId,tweetId);
 * List<Integer> param_2 = obj.getNewsFeed(userId);
 * obj.follow(followerId,followeeId);
 * obj.unfollow(followerId,followeeId);
 */
