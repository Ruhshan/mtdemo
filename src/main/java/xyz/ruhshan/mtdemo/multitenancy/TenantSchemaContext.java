package xyz.ruhshan.mtdemo.multitenancy;

public class TenantSchemaContext {
    private static final String DEFAULT_TENANT = "public";
    private static final ThreadLocal<String> currentTenant = new ThreadLocal<>();

    public static String getCurrentTenant() {
        var tenant =  currentTenant.get();

        return tenant == null ? DEFAULT_TENANT : tenant;
    }

    public static void setCurrentTenant(String tenant) {
        currentTenant.set(tenant);
    }

    public static void clear() {
        currentTenant.remove();
    }
}
