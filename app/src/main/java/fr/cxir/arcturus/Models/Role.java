package fr.cxir.arcturus.Models;

class Role {

    private Integer id;
    private String  name;

    public Role( Integer id,
                 String name ) {

        this.id   = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Role{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
