/**
 * Project name(项目名称)：成员方法
 * Package(包名): PACKAGE_NAME
 * Author(作者）: mao
 * Author QQ：1296193245
 * Date(创建日期)： 2021/10/4
 * Time(创建时间)： 12:27
 * Version(版本): 1.0
 * Description(描述)： 无
 */

public class Student
{
    public String Name;    // 学生姓名
    public int Age;    // 学生年龄
    private boolean Sex;    // 学生性别

    public boolean isSex()
    {
        return Sex;
    }

    public void setSex(boolean sex)
    {
        Sex = sex;
    }

    public StringBuffer display(Student s)
    {
        StringBuffer stu = new StringBuffer();
        stu.append("名字:").append(s.Name).append("\t性别:").append(s.Sex).append("\t年龄：").append(s.Age);
        return stu;
    }

}
