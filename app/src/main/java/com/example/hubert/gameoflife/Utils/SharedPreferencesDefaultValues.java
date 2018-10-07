package com.example.hubert.gameoflife.Utils;

import com.example.hubert.gameoflife.Education.Skill;
import com.example.hubert.gameoflife.Education.Subject;
import com.example.hubert.gameoflife.House.Lodging;
import com.example.hubert.gameoflife.House.Transport;
import com.example.hubert.gameoflife.R;
import com.google.gson.Gson;

import java.util.ArrayList;

public class SharedPreferencesDefaultValues {

    private static final Gson gson = new Gson();

    public static final String DefaultName = "Mr. Hubi";
    public static final int DefaultIcon = R.drawable.avatar_icon1;
    public static final int DefaultMoney = 500000;
    public static final int DefaultMoneyInSafe = 0;

    public static final int DefaultAgeYears = 19;
    public static final int DefaultAgeDays = 0;

    public static final int DefaultDateYears = 2000;
    public static final int DefaultDateMonths = 1;
    public static final int DefaultDateDays = 1;
    public static final int DefaultTimeHours = 12;

    public static final int DefaultDayWeek = 1;

    public static final String DefaultMyLodging = gson.toJson(new Lodging("Parents House", 0,  5, 125, 5));
    public static final String DefaultMyLodgingAfter18 = gson.toJson(new Lodging("Public Bench and Blanket from The Garbage Bin", 0,  -5, 75, -5));
    public static final boolean DefaultIsInSchoolNow = true;
    public static final String DefaultMyJob = null;
    public static final String DefaultMyTransport = gson.toJson(new Transport("Foots", 0, 10));
    public static final String DefaultMyGirlboyfriend = null;
    public static final String DefaultMyChildren = null;

    public static final int DefaultWorkPosition = 0;

    public static final int DefaultHealth = 750;
    public static final int DefaultHungry = 750;
    public static final int DefaultEnergy = 750;
    public static final int DefaultHappiness = 750;

    public static final String DefaultMyComputer = null;
    public static final String DefaultMyTv = null;
    public static final String DefaultMyPhone = null;
    public static final String DefaultOwnedLotteries = gson.toJson(new ArrayList<>());
    public static final boolean DefaultHaveSafe = false;

    /*static private final Subject[] subjectsList = new Subject[] {
            new Subject("Mathematics", 4),
            new Subject("English", 4),
            new Subject("Mathematics", 4),
            new Subject("Languages", 4),
            new Subject("History", 4),
            new Subject("Geographic", 4),
            new Subject("Psychic", 4),
            new Subject("Biology", 4),
            new Subject("Information Technology", 4),
            new Subject("Art", 4),
            new Subject("Music", 4),
            new Subject("Psychical Education", 4),
            new Subject("Behavior", 4), };*/

    public static Skill PassPrimarySchool = new Skill("Pass Primary School", 100, 10);
    public static Skill PassSecondarySchool = new Skill("Pass Secondary School", 750, 15);
    public static Skill PassHighSchool = new Skill("Pass High School", 2500, 20);
    public static Skill GeneralTraing = new Skill("General training", 7500, 25);
    public static Skill StudyAtCollage = new Skill("Study At Collage", 12500, 30);
    public static Skill GetAMastersDegree = new Skill("Get A Master's Degree", 25000, 35);
    private static final Skill[] skillsEducationList = new Skill[] {
            PassPrimarySchool,
            PassSecondarySchool,
            PassHighSchool,
            GeneralTraing,
            StudyAtCollage,
            GetAMastersDegree,
    };

    static private final Skill[] skillsCriminalList = new Skill[] {
            new Skill("Weapon Skills Beginner", 100, 10),
            new Skill("Weapon Skills Intermediate", 750, 15),
            new Skill("Weapon Skills Advanced", 2500, 20),
            new Skill("Thief Skills Beginner", 100, 10),
            new Skill("Thief Skills Beginner", 750, 15),
            new Skill("Thief Skills Beginner", 2500, 20),};

    static private final Skill[] skillsSpecialList = new Skill[] {
            new Skill("Driving Skills", 100, 10),};

    //public static final String DefaultSubjectsList = gson.toJson(subjectsList);
    public static final int DefaultEducationPoints = 100;
    public static final String DefaultSkillsEducationList = gson.toJson(skillsEducationList);
    public static final String DefaultSkillsCriminalList = gson.toJson(skillsCriminalList);
    public static final String DefaultSkillsSpecialList = gson.toJson(skillsSpecialList);

    public static final int DefaultCommunicationsSkills = 100;
    public static final int DefaultCriminalPoints = 100;
    public final static int DefaultKarmaPoints = 70;
    public static final int DefaultWorkRelations = 500;

    // TODO NIGDY NIE DAWAJ NULL! godzine nad tym bledem siedzialem..
    public static final String DefaultGamesList = gson.toJson(new ArrayList<>());
    public static final String DefaultDrawingsList = gson.toJson(new ArrayList<>());
    public static final String DefaultBooksList = gson.toJson(new ArrayList<>());
    public static final String DefaultMoviesList = gson.toJson(new ArrayList<>());
}
