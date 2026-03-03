package Oops;

public class Uzer {
    private String name;

    private Uzer(Builder builder) {
        this.name = builder.name;
    }
    public static class Builder
    {
        private String name;

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public User build()
        {
            return new User(this);
        }
    }
}
