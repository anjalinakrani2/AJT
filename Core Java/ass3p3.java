//Write a Java Program to implement the Living Organisms hierarchy
class Kingdom {
    protected String kingdom;

    Kingdom(String kingdom) {
        this.kingdom = kingdom;
    }

    public String getKingdom() {
        return this.kingdom;
    }

    public void setKingdom(String kingdom) {
        this.kingdom = kingdom;
    }

    public String toString() {
        return "Kingdom : " + this.kingdom;
    }
}

class Phylum extends Kingdom {
    protected String phylum;

    Phylum(String kingdom, String phylum) {
        super(kingdom);
        this.phylum = phylum;
    }

    public String getPhylum() {
        return this.phylum;
    }

    public void setPhylum(String phylum) {
        this.phylum = phylum;
    }

    public String toString() {
        return super.toString() + "\nPhylum : " + this.phylum;
    }
}

class Classs extends Phylum {
    protected String classs;

    Classs(String kingdom, String phylum, String classs) {
        super(kingdom, phylum);
        this.classs = classs;
    }

    public String getClasss() {
        return this.classs;
    }

    public void setClass(String classs) {
        this.classs = classs;
    }

    public String toString() {
        return super.toString() + "\nClass : " + this.classs;
    }

}

class Order extends Classs {
    protected String order;

    Order(String kingdom, String phylum, String classs, String order) {
        super(kingdom, phylum, classs);
        this.order = order;
    }

    public String getOrder() {
        return this.order;
    }

    public void setOrder(String order) {
        this.order = order;
    }

    public String toString() {
        return super.toString() + "\nOrder : " + this.order;
    }
}

class Family extends Order {
    protected String family;

    Family(String kingdom, String phylum, String classs, String order, String family) {
        super(kingdom, phylum, classs, order);
        this.family = family;
    }

    public String getFamily() {
        return this.family;
    }

    public void setFamily(String family) {
        this.family = family;
    }

    public String toString() {
        return super.toString() + "\nFamily : " + this.family;
    }
}

class Genus extends Family {
    protected String genus;

    Genus(String kingdom, String phylum, String classs, String order, String family, String genus) {
        super(kingdom, phylum, classs, order, family);
        this.genus = genus;
    }

    public String getGenus() {
        return this.genus;
    }

    public void setGenus(String genus) {
        this.genus = genus;
    }

    public String toString() {
        return super.toString() + "\nGenus : " + this.genus;
    }
}

class Species extends Genus {
    protected String species;

    Species(String kingdom, String phylum, String classs, String order, String family, String genus, String species) {
        super(kingdom, phylum, classs, order, family, genus);
        this.species = species;
    }

    public String getSpecies() {
        return this.species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public String toString() {
        return super.toString() + "\nSpecies : " + this.species;
    }
}

public class ass3p3 {
    public static void main(String[] args) {
        Species s1 = new Species("Animalia", "Chordata", "Mammalia", "Carnivora", "Canidae", "Vulpes", "Vulpes vulpes");
        System.out.println("Species s1:\n" + s1);
    }
}
