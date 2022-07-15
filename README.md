# KnockbackAPI
a knockbackapi for ariacraft XD

## API
```java
    public static void setKnockbackProfile(Player player, String knockbackProfile) {
        IKnockback<?, ?, ?, ?> profile = KnockbackAPI.getByName(knockbackProfile);
        if (player.isOnline() && profile != null) {
            KnockbackAPI.applyKnockback(profile, player);
        }
```        
        
        
        
