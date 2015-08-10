package main.gof.creational.builder.items;

public class Laptop {

    private String processor = null;
    private String display = null;
    private String videoAdapter = null;

    public void setProcessor(String processor) {
        this.processor = processor;
    }

    public void setDisplay(String display) {
        this.display = display;
    }

    public void setVideoAdapter(String videoAdapter) {
        this.videoAdapter = videoAdapter;
    }

    public String getProcessor() {
        return processor;
    }

    public String getDisplay() {
        return display;
    }

    public String getVideoAdapter() {
        return videoAdapter;
    }
}
