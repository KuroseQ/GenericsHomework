public class Sword<T extends Metal> {
    T material;

    Sword(T material) {
        this.material = material;
    }

    public boolean checkEndurance() {
        return material.getEndurance() > 49;
    }
}
