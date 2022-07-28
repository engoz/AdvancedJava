package com.eng.computedFeature;

import java.util.concurrent.CompletableFuture;

public class ComputedFeaturedEx {
    public static void main(String[] args) {
        CompletableFuture<Integer> future
                = CompletableFuture.supplyAsync(() -> 0);

        future.thenApplyAsync(x -> x + 1) // call 1
                .thenApplyAsync(x -> x + 1)
                .thenAccept(x -> System.out.println("async result: " + x));

        future.thenApply(x -> x + 1) // call 2
                .thenApply(x -> x + 1)
                .thenAccept(x -> System.out.println("sync result:" + x));
    }
}
