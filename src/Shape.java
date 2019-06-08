public interface Shape {
    String getName();

    void setMaterial(Material material);

    void setProperties(Properties properties);

    void setLengths(double size);
    double getArea();

    String getShapeInfo();



}
