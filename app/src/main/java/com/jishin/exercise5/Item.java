package com.jishin.exercise5;

import java.util.ArrayList;

/**
 * Created by LanAnh on 31/10/2017.
 */

public class Item {
    private String name;
    private int photo;

    public Item(){}
    public Item(String name, int photo) {
        this.name = name;
        this.photo = photo;
    }

    public int getPhoto() {
        return photo;
    }

    public void setPhoto(int photo) {
        this.photo = photo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Item>createListTeachers(){
        ArrayList<Item> list = new ArrayList<>();
        list.add(new Item("Phạm Thi Vương", R.drawable.ic_user_default));
        list.add(new Item("Nguyễn Thị Thanh Trúc", R.drawable.ic_user_default));
        list.add(new Item("Nguyễn Tuấn Anh", R.drawable.ic_user_default));
        list.add(new Item("Nguyễn Tấn Trần Minh Khang", R.drawable.ic_user_default));
        list.add(new Item("Vũ Thanh Nguyên", R.drawable.ic_user_default));
        list.add(new Item("Nguyễn Công Hoan", R.drawable.ic_user_default));
        list.add(new Item("Đinh Nguyễn Anh Dũng", R.drawable.ic_user_default));
        list.add(new Item("Hầu Nguyễn Thành Nam", R.drawable.ic_user_default));
        list.add(new Item("Dương Hoài Thanh", R.drawable.ic_user_default));
        list.add(new Item("Phan Trung Hiếu", R.drawable.ic_user_default));
        return list;
    }

    public ArrayList<Item> createListSubjects(){
        ArrayList<Item>list = new ArrayList<>();
        list.add(new Item("Lập trình hướng đối tượng", R.drawable.ic_subject));
        list.add(new Item("CTDL và Giải thuật", R.drawable.ic_subject));
        list.add(new Item("Công nghệ phần mềm", R.drawable.ic_subject));
        list.add(new Item("Giao tiếp người máy", R.drawable.ic_subject));
        list.add(new Item("Lập trình di động", R.drawable.ic_subject));
        list.add(new Item("Nhập môn phát triển game", R.drawable.ic_subject));
        list.add(new Item("Đồ án mã nguồn mở", R.drawable.ic_subject));
        list.add(new Item("Kiểm chứng phần mềm", R.drawable.ic_subject));
        return list;
    }
    public ArrayList<Item> createListStudents(){
        ArrayList<Item>list = new ArrayList<>();
        list.add(new Item("Nghiêm Lan Anh",R.drawable.ic_students));
        list.add(new Item("Nguyễn Hữu Trung",R.drawable.ic_students));
        list.add(new Item("Vũ Tô Thanh Hoài",R.drawable.ic_students));
        list.add(new Item("Nguyễn Hữu Đức",R.drawable.ic_students));
        list.add(new Item("Đinh Hoàng Khang",R.drawable.ic_students));
        list.add(new Item("Võ Thị Thúy Nga",R.drawable.ic_students));
        list.add(new Item("Huỳnh Thế An",R.drawable.ic_students));
        list.add(new Item("Nguyễn Thị Thùy Dung",R.drawable.ic_students));
        list.add(new Item("Phan Tiến Đạt",R.drawable.ic_students));
        list.add(new Item("Nguyễn Việt Nam",R.drawable.ic_students));
        return list;
    }
}
