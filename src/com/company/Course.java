package com.company;

public class Course
{
    private String name;
    private String topic;
    private String nameOfTeacher;
    private int noOfParticipants;

    public Course (String name, String topic, String nameOfTeacher, int noOfParticipants)
    {
        this.name = name;
        this.topic = topic;
        this.nameOfTeacher = nameOfTeacher;
        this.noOfParticipants = noOfParticipants;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getTopic()
    {
        return topic;
    }

    public void setTopic(String topic)
    {
        this.topic = topic;
    }

    public String getNameOfTeacher()
    {
        return nameOfTeacher;
    }

    public void setNameOfTeacher(String nameOfTeacher)
    {
        this.nameOfTeacher = nameOfTeacher;
    }

    public int getNoOfParticipants()
    {
        return noOfParticipants;
    }

    public void setNoOfParticipants(int noOfParticipants)
    {
        this.noOfParticipants = noOfParticipants;
        if (noOfParticipants<0)
            System.out.println("Invalid input");
    }

    public boolean hasParticipants()
    {
        return noOfParticipants != 0;
    }
}

