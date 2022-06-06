package com.eng.chapter1;

import org.openjdk.jmh.annotations.*;
import org.openjdk.jmh.infra.Blackhole;
import org.openjdk.jmh.runner.Runner;
import org.openjdk.jmh.runner.RunnerException;
import org.openjdk.jmh.runner.options.Options;
import org.openjdk.jmh.runner.options.OptionsBuilder;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

public class CompareTwoMetods {

    public static final int ARRAY_SIZE = 500_000;

    @State(Scope.Thread)
    public static class MyValues {
      Map<String,String> myMap= new HashMap<>();

        @Setup(Level.Trial)
        public void doSetup() {
            for (int i = 0; i < ARRAY_SIZE; i++) {
                myMap.put(i+"-E","V-"+i);
            }
        }
    }


    @Benchmark
    @BenchmarkMode(Mode.Throughput)
    @OutputTimeUnit(TimeUnit.MILLISECONDS)
    public void getMedhods(CompareTwoMetods.MyValues myState, Blackhole blackhole) {
        blackhole.consume(myState.myMap.get("5000-E"));

    }

    @Benchmark
    @BenchmarkMode(Mode.Throughput)
    @OutputTimeUnit(TimeUnit.MILLISECONDS)
    public void containMethods(CompareTwoMetods.MyValues myState, Blackhole blackhole) {
            blackhole.consume(myState.myMap.containsKey("5000-E"));
    }

    public static void main(String... args) throws RunnerException {

        Options opts = new OptionsBuilder()
                .include("CompareTwoMetods")
                .warmupIterations(1)
                .measurementIterations(1)
                .jvmArgs("-Xms2g", "-Xmx2g")
                .shouldDoGC(true)
                .forks(1)
                .build();

        new Runner(opts).run();
    }
}
