public class Main{
    public static void main(String[] args) {
        PostManager manager = new PostManager();
        
        String postTitle = "Java Programming Tips";
        int engagementScore = manager.calculateEngagement(150, 75, 25); // likes, comments, shares
        String category = manager.getCategoryRating(engagementScore);

        System.out.println("=== Post Stats (Basic) ===");
        manager.displayPostStats(postTitle, engagementScore);

        System.out.println("\n=== Post Stats (With Category) ===");
        manager.displayPostStats(postTitle, engagementScore, category);

        String[] hashtags = {"#java", "#coding", "#programming", "#java", "#tips"};
        ArrayList<String> uniqueHashtags = manager.manageHashtags(hashtags);
        System.out.println("\n=== Unique Hashtags ===");
        System.out.println(uniqueHashtags);

        ArrayList<String> posts = new ArrayList<>();
        posts.add("Java Programming Tips");
        posts.add("Daily Coding Challenges");
        posts.add("Low Engagement Post");

        HashMap<String, Integer> postEngagement = new HashMap<>();
        postEngagement.put("Java Programming Tips", engagementScore);
        postEngagement.put("Daily Coding Challenges", 1200);
        postEngagement.put("Low Engagement Post", 40);

        LinkedList<String> trendingPosts = manager.findTrendingPosts(posts, postEngagement);
        System.out.println("\n=== Trending Posts (Engagement > 500) ===");
        System.out.println(trendingPosts);

        HashSet<String> uniqueAuthors = manager.getUniqueAuthors("Alice", "Bob", "Alice", "Charlie", "Bob");
        System.out.println("\n=== Unique Authors ===");
        System.out.println(uniqueAuthors);
    }
}
