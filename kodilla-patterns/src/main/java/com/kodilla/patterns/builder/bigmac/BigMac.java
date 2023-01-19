package com.kodilla.patterns.builder.bigmac;

import java.util.ArrayList;
import java.util.List;

public final class BigMac {
    private final List<String> buns;
    private final int burgers;
    private final List<String> sauces;
    private final List<String> ingredients;


    public static class BigMacBuilder {
        private final List<String> buns = new ArrayList<>();
        private int burgers;
        private final List<String> sauces = new ArrayList<>();
        private final List<String> ingredients = new ArrayList<>();

        public BigMacBuilder bun (String bun) {
            buns.add(bun);
            return this;
        }

        public BigMacBuilder burgers (int burgers) {
            this.burgers = burgers;
            return this;
        }

        public BigMacBuilder sauce (String sauce) {
            sauces.add(sauce);
            return this;
        }

        public BigMacBuilder ingredient (String ingredient) {
            ingredients.add(ingredient);
            return this;
        }

        public BigMac build() {
            return new BigMac(buns, burgers, sauces, ingredients);
        }
    }

    public List<String> getBuns() {
        return buns;
    }

    public int getBurgers() {
        return burgers;
    }

    public List<String> getSauces() {
        return sauces;
    }

    public List<String> getIngredients() {
        return ingredients;
    }

    private BigMac (final List<String> buns, final int burgers, final List<String> sauces, final List<String> ingredients) {
        this.buns = new ArrayList<>(buns);
        this.burgers = burgers;
        this.sauces = new ArrayList<>(sauces);
        this.ingredients = new ArrayList<>(ingredients);
    }

    @Override
    public String toString() {
        return "BigMac{" +
                "buns=" + buns +
                ", burgers=" + burgers +
                ", sauces=" + sauces +
                ", ingredients=" + ingredients +
                '}';
    }

}
