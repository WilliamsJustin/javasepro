package controller;
import domain.Teacher;
import service.TeacherService;

import java.util.ArrayList;
import java.util.Scanner;

public class TeacherController {


        private static TeacherService teacherService = new TeacherService();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Teacher> teachers = new ArrayList<>();
//        public void start() {

            teacherLoop:
            while (true) {
                System.out.println("--------欢迎来到 <老师> 管理系统--------");
                System.out.println("请输入您的选择: 1.添加老师  2.删除老师  3.修改老师  4.查看老师  5.退出");
                String choice = sc.next();
                switch (choice) {
                    case "1":
                        addTeacher(teachers,sc);
                        break;
                    case "2":
//                        deleteTeacherById();
                        break;
                    case "3":
//                        updateTeacher();
                        break;
                    case "4":
//                        findAllTeacher();
                        break;
                    case "5":
                        System.out.println("感谢您使用老师管理系统, 再见!");
                        break teacherLoop;
                    default:
                        System.out.println("您的输入有误, 请重新输入");
                        break;
                }
            }

//        }
}

        public static void addTeacher(ArrayList<Teacher> teachers,Scanner sc) {
            Teacher teacher = new Teacher();
            boolean flag=false;
            while (true) {
                System.out.println("----------添加学生-----------" );
                System.out.println("请输入学号：" );
                String id = sc.next();
                for (Teacher student1:teachers){
                    if (id.equals(student1.getId())){
                        flag = true;
                    }
                }
                if (flag){
                    System.out.println("已有该学号，请重新输入");
//                return;
                    break;
                }else {

                    Teacher input=inputTeacherInfo(id,sc);
                    teachers.add(input);
                    System.out.println("添加成功" );
                    break;
                }
            }
        }


    public static String inputTeacherId(Scanner sc){
            String id;
            while(true){
                System.out.println("请输入id");
                id = sc.next();
                boolean exists = teacherService.isExists(id);
                if(!exists){
                    System.out.println("您输入的id不存在, 请重新输入:");
                }else{
                    break;
                }
            }
            return id;
        }

        public static Teacher inputTeacherInfo(String id,Scanner sc){
            System.out.println("请输入老师姓名:");
            String name = sc.next();
            System.out.println("请输入老师年龄:");
            String age = sc.next();
            System.out.println("请输入老师生日:");
            String birthday = sc.next();

            Teacher t = new Teacher();
            t.setId(id);
            t.setName(name);
            t.setAge(age);
            t.setBirthday(birthday);
            return t;
        }
    }


