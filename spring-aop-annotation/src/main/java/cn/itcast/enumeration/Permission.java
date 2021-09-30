package cn.itcast.enumeration;

public enum Permission {
    READ(1, "读取权限", null),
    WRITE(2, "写入权限", 1);
    private Integer id;
    private String name;
    private Integer parentId;

    Permission() {
    }

    Permission(Integer id, String name, Integer parentId) {
        this.id = id;
        this.name = name;
        this.parentId = parentId;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getParentId() {
        return parentId;
    }

    public void setParentId(Integer parentId) {
        this.parentId = parentId;
    }
}
