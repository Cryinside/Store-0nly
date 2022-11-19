package ss12_JavaCollectionFrameWork.thuchanh;

import org.omg.PortableInterceptor.HOLDING;

public class HocSinh implements Comparable<HocSinh>{
    private String name;
    private Integer age;
    private String address;

    public HocSinh(String name, Integer age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "HocSinh{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", address='" + address + '\'' +
                '}';
    }

    @Override
    public int compareTo(HocSinh hocSinh) {
        return this.getName().compareTo(hocSinh.getName());
    }
}
