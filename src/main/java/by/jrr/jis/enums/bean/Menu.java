package by.jrr.jis.enums.bean;


import jdk.jshell.spi.ExecutionControl;

public enum Menu {
    LOGIN("/login", true) {
        @Override
        public void abstractMethod() {
            System.out.println("abstract Login: ");
        }

        @Override
        public void commonMethod() {
            System.out.println("custom implementation: Released status for "+getUri() +" is " + isReleased());
        }
    },
    HOME("/home", false) {
        @Override
        public void abstractMethod() {
            System.out.println("abstract HOME: ");
        }

        @Override
        public void specialMethod() {
            System.out.println("special HOME: ");
        }
    },
    BLOG(false) {
        @Override
        public void abstractMethod() throws ExecutionControl.NotImplementedException {
           throw new ExecutionControl.NotImplementedException("BLOG is not implemented yet");
        }
    },

    FEEDBACK() {
        @Override
        public void abstractMethod() throws ExecutionControl.NotImplementedException {
            throw new ExecutionControl.NotImplementedException("BLOG is not implemented yet");
        }
    };

    private final String uri;
    private final boolean released;

    Menu(String uri, boolean released) {
        this.uri = uri;
        this.released = released;
    }

    Menu(boolean released) {
        this.uri = "/defaultPage";
        this.released = released;
    }
    Menu() {
        this.uri = "/defaultPage";
        this.released = false;
    }


    public String getUri() {
        return uri;
    }

    public boolean isReleased() {
        return released;
    }

    public void printReleasedEndpoints() {
        if (isReleased()) {
            System.out.println("URI: " + uri);
        }
    }

    public void commonMethod() {
        System.out.println("common URI: " + uri + " isReleased " + isReleased());
    }

    public abstract void abstractMethod() throws ExecutionControl.NotImplementedException;

    public static Menu findByUri(String uri) throws Exception{
        switch (uri) {
            case "/login": return Menu.LOGIN;
            case "/home": return Menu.HOME;
            default: throw new Exception(uri + " not present ");
        }
    }

    public void specialMethod() {
        // костыль
    }
}
