public class Properties {
    private Integer light;
    private Integer contrast;
    private String color;

    public void setLight(int light){
        this.light = light;
    }
    public Integer getLight(){
        if (light == null) return null;
        else return light;
    }

    public void setContrast(int contrast){
        this.contrast = contrast;
    }

    public Integer getContrast(){
        if (contrast == null) return null;
        else return contrast;
    }

    public void setColor(String color){
        this.color = color;
    }

    public String getColor(){
        if (color == null) return null;
        else return color;
    }

}
