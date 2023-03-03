package com.example.learnandroid;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import java.util.Objects;

public class interview_QA extends AppCompatActivity {
    private AlertDialog alertDialog=null;
    private AlertDialog.Builder builder;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_interview_qa);

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        Objects.requireNonNull(getSupportActionBar()).setTitle("Interview Q/A");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        ListView listViewDemo;
        String[] listItemDemo = {"What is Android?", "What main components of Android application?"
                , "Where will you declare your activity so the system can access it?"
                ,"What is Application?"
                ,"What is Context?"
                ,"What is Armv7?"
                ,"Why bytecode cannot be run in Android?"
                ,"What is the Android Application Architecture?"
                ,"Describe activities"
                ,"Why would you do the setContentView() in onCreate() of Activity class?"
                ,"onSavedInstanceState() and onRestoreInstanceState() in activity?"
                ,"Standard Launch modes in Android?"
                ,"SingleTop Launch modes in Android?"
                ,"SingleTask Launch modes in Android?"
                ,"SingleInstanceLaunch modes in Android?"
                ,"How does the activity respond when the user rotates the screen?"
                ,"How to prevent the data from reloading and resetting when the screen is rotated?"
                ,"Mention two ways to clear the back stack of Activities when a new Activity is called using intent"
                ,"What’s the difference between FLAG_ACTIVITY_CLEAR_TASK and FLAG_ACTIVITY_CLEAR_TOP?"
                ,"Describe content providers?"
                ,"Access data using Content Provider."
                ,"Describe services?"
                ,"Difference between Service & Intent Service"
                ,"Difference between AsyncTasks & Threads?"
                ,"What are Handlers?"
                ,"Difference between Activity & Service?"
                ," How would you update the UI of an activity from a background service?"
                ,"What is an intent?"
                ,"What is a Sticky Intent?"
                ,"What is a Pending Intent?"
                ,"What is an Action?"
                ,"What are intent Filters?"
                ,"Describe fragments?"
                ,"What is the difference between fragments & activities?"
                ,"When should you use a fragment rather than an activity?"
                ,"Difference between adding/replacing fragment in backstack?"
                ,"Why is it recommended to use only the default constructor to create a Fragment?"
                ,"You’re replacing one Fragment with another — how do you ensure that the user can return to the previous Fragment, by pressing the Back button?"
                ,"Callbacks invoked during addition of a fragment to back stack and while popping back from back stack:"
                ,"What are retained fragments?"
                ,"Difference between FragmentPagerAdapter vs FragmentStatePagerAdapter?"
                ,"What is Toast in Android?"
                ,"What are Loaders in Android?"
                ,"What is the difference between Dialog & DialogFragment?"
                ,"What is View Group? How are they different from Views?"
                ,"What is the difference between a regular .png and a nine-patch image?"
                ,"Difference between RelativeLayout and LinearLayout?"
                ,"What is ConstraintLayout?"
                ,"When might you use a FrameLayout?"
                ,"What is Adapters?"
                ,"How to support different screen sizes?"
                ,"What is an Application Not Responding (ANR) error, and how can you prevent them from occurring in an app?"
                ,"What is a singleton class in Android?"
                ,"What’s the difference between commit() and apply() in SharedPreferences?"
                ,"How does RecyclerView work?"
                ,"How does RecyclerView differ from ListView?"
                ,"Difference between MVC & MVP & MVVM?"
                ,"What is applicationID?"
                ,"What is startAnimation?"
                ,"What is TDD(Test-Driven development)?"
                ,"What are Synthetic Sensors?"
                ,"What is NotificationManager class?"
                ,"What are location providers in android?"
//                ,""
//                ,""
//                ,""
//                ,""
//                ,""
//                ,""
//                ,""
//                ,""
              };




        String[] answer = {"Android is a Software for mobile devices which includes an Operating System, middleware and some key applications"

                ,"Activities: They dictate the UI and handle the user interaction to the screen.\n" +
                "Services: They handle background processing associated with an application.\n" +
                "Broadcast Receivers: It handles the communication between Applications and Android Operating system\n" +
                "Content Providers: They handle data and database management stuff."

                ,"Activity is to be declared in the manifest file. For example:\n" +
                "<manifest> </manifest>\n" +
                "<application> </application>\n" +
                "<activity android:name=”.MyTestActivity”> </activity>"

                ,"The Application class in Android is the base class within an Android app that contains all other components such as activities and services."

                ,"A Context is a handle to the system; it provides services like resolving resources, obtaining access to databases and preferences, and so on. An Android app has activities. "

                ,"There are 3 CPU architectures in Android. ARMv7 is the most common as it is optimised for battery consumption. ARM64 is an evolved version of that that supports 64-bit processing for more powerful computing."

                ,"Android uses DVM (Dalvik Virtual Machine ) rather using JVM(Java Virtual Machine)."

                ,"Android application architecture has the following components:\n" +
                "Services − It will perform background functionalities\n" +
                "Intent − It will perform the inter connection between activities and the data passing mechanism\n" +
                "Resource Externalization − strings and graphics\n" +
                "Notification − light, sound, icon, notification, dialog box and toast\n" +
                "Content Providers − It will share the data between applications"

                ,"Activities are basically containers or windows to the user interface."

                ,"As onCreate() of an Activity is called only once, this is the point where most initialisation should go. It is inefficient to set the content in onResume() or onStart() (which are called multiple times) as the setContentView() is a heavy operation."

                ,"OnRestoreInstanceState() - When activity is recreated after it was previously destroyed, we can recover the saved state from the Bundle that the system passes to the activity. Both the onCreate() and onRestoreInstanceState() callback methods receive the same Bundle that contains the instance state information. "

                ,"Standard: It creates a new instance of an activity in the task from which it was started. Multiple instances of the activity can be created and multiple instances can be added to the same or different tasks.\n" +
                "Eg: Suppose there is an activity stack of A -> B -> C.\n" +
                "Now if we launch B again with the launch mode as “standard”, the new stack will be A -> B -> C -> B."

                ,"SingleTop: It is the same as the standard, except if there is a previous instance of the activity that exists in the top of the stack, then it will not create a new instance but rather send the intent to the existing instance of the activity.\n" +
                "Eg: Suppose there is an activity stack of A -> B.\n" +
                "Now if we launch C with the launch mode as “singleTop”, the new stack will be A -> B -> C as usual.\n" +
                "Now if there is an activity stack of A -> B -> C.\n" +
                "If we launch C again with the launch mode as “singleTop”, the new stack will still be A -> B -> C."

                ,"SingleTask: A new task will always be created and a new instance will be pushed to the task as the root one.\n"+"Eg: Suppose there is an activity stack of A -> B -> C -> D.\n" +
                "Now if we launch D with the launch mode as “singleTask”, the new stack will be A -> B -> C -> D as usual.\n" +
                "Now if there is an activity stack of A -> B -> C -> D.\n" +
                "If we launch activity B again with the launch mode as “singleTask”, the new activity stack will be A -> B. Activities C and D will be destroyed."

                ,"SingleInstance: Same as single task but the system does not launch any activities in the same task as this activity. If new activities are launched, they are done so in a separate task.\n" +
                "Eg: Suppose there is an activity stack of A -> B -> C -> D. If we launch activity B again with the launch mode as “singleInstance”, the new activity stack will be:\n" +
                "Task1 — A -> B -> C\n" +
                "Task2 — D"

                ,"When the screen is rotated, the current instance of activity is destroyed a new instance of the Activity is created in the new orientation. The onRestart() method is invoked first when a screen is rotated."

                ,"The most basic approach would be to use a combination of ViewModels and onSaveInstanceState() . So how we do we that?\n" +
                "Basics of ViewModel: A ViewModel is LifeCycle-Aware. In other words, a ViewModel will not be destroyed if its owner is destroyed for a configuration change (e.g. rotation). The new instance of the owner will just re-connected to the existing ViewModel. So if you rotate an Activity three times, you have just created three different Activity instances, but you only have one ViewModel.\n" +
                "So the common practice is to store data in the ViewModel class (since it persists data during configuration changes) and use OnSaveInstanceState to store small amounts of UI data.\n" +
                "For instance, let’s say we have a search screen and the user has entered a query in the Edittext. This results in a list of items being displayed in the RecyclerView. Now if the screen is rotated, the ideal way to prevent resetting of data would be to store the list of search items in the ViewModel and the query text user has entered in the OnSaveInstanceState method of the activity."

                ,"The first approach is to use a FLAG_ACTIVITY_CLEAR_TOP flag. The second way is by using FLAG_ACTIVITY_CLEAR_TASK and FLAG_ACTIVITY_NEW_TASK in conjunction."

                ,"FLAG_ACTIVITY_CLEAR_TASK is used to clear all the activities from the task including any existing instances of the class invoked. The Activity launched by intent becomes the new root of the otherwise empty task list. This flag has to be used in conjunction with FLAG_ ACTIVITY_NEW_TASK.\n" +
                "FLAG_ACTIVITY_CLEAR_TOP on the other hand, if set and if an old instance of this Activity exists in the task list then barring that all the other activities are removed and that old activity becomes the root of the task list. "

                ,"A ContentProvider provides data from one application to another, when requested. It manages access to a structured set of data. It provides mechanisms for defining data security. ContentProvider is the standard interface that connects data in one process with code running in another process."

                ,"Start by making sure your Android application has the necessary read access permissions. Then, get access to the ContentResolver object by calling getContentResolver() on the Context object, and retrieving the data by constructing a query using ContentResolver.query().\n" + "The ContentResolver.query() method returns a Cursor, so you can retrieve data from each column using Cursor methods."

                ,"A Service is an application component that can perform long-running operations in the background, and it doesn't provide a user interface. It can run in the background, even when the user is not interacting with your application. These are the three different types of services:\n" +
                "Foreground Service: A foreground service performs some operation that is noticeable to the user. For example, we can use a foreground service to play an audio track. A Notification must be displayed to the user.\n" +
                "Background Service: A background service performs an operation that isn’t directly noticed by the user.\n" +
                "Bound Service: A service is bound when an application component binds to it by calling bindService(). A bound service offers a client-server interface that allows components to interact with the service, send requests, receive results."

                ,"Service is the base class for Android services that can be extended to create any service. A class that directly extends Service runs on the main thread so it will block the UI (if there is one) and should therefore either be used only for short tasks or should make use of other threads for longer tasks.\n" +
                "IntentService is a subclass of Service that handles asynchronous requests (expressed as “Intents”) on demand. Clients send requests through startService(Intent) calls. The service is started as needed, handles each Intent in turn using a worker thread, and stops itself when it runs out of work."

                ,"Thread should be used to separate long running operations from main thread so that performance is improved. But it can’t be cancelled elegantly and it can’t handle configuration changes of Android. You can’t update UI from Thread.\n" +
                "AsyncTask can be used to handle work items shorter than 5ms in duration. With AsyncTask, you can update UI unlike java Thread. But many long running tasks will choke the performance."

                ,"Handlers are objects for managing threads. It receives messages and writes code on how to handle the message. They run outside of the activity’s lifecycle, so they need to be cleaned up properly or else you will have thread leaks.\n" +
                "Handlers allow communicating between the background thread and the main thread.\n" +
                "A Handler class is preferred when we need to perform a background task repeatedly after every x seconds/minutes."

                ,"Activities are basically containers or windows to the user interface. Services is a component that is used to perform operations on the background. It does not have an UI."

                ,"We need to register a LocalBroadcastReceiver in the activity. And send a broadcast with the data using intents from the background service. As long as the activity is in the foreground, the UI will be updated from the background. Ensure to unregister the broadcast receiver in the onStop() method of the activity to avoid memory leaks. We can also register a Handler and pass data using Handlers."

                ,"Intents are messages that can be used to pass information to the various components of android. For instance, launch an activity, open a webview etc. Two types of intents-\n" +
                "Implicit: Implicit intent is when you call system default intent like send email, send SMS, dial number.\n" +
                "Explicit: Explicit intent is when you call an application activity from another activity of the same application."

                ,"Sticky Intents allows communication between a function and a service. sendStickyBroadcast() performs a sendBroadcast(Intent) known as sticky, i.e. the Intent you are sending stays around after the broadcast is complete, so that others can quickly retrieve that data through the return value of registerReceiver(BroadcastReceiver, IntentFilter). For example, if you take an intent for ACTION_BATTERY_CHANGED to get battery change events: When you call registerReceiver() for that action — even with a null BroadcastReceiver — you get the Intent that was last Broadcast for that action."

                ,"If you want someone to perform any Intent operation at future point of time on behalf of you, then we will use Pending Intent."
                ,"Description of the intent. For instance, ACTION_CALL — used to perform calls"

                ,"Specifies the type of intent that the activity/service can respond to."

                ,"Fragment is a UI entity attached to Activity. Fragments can be reused by attaching in different activities. Activity can have multiple fragments attached to it. Fragment must be attached to an activity and its lifecycle will depend on its host activity."

                ,"An Activity is an application component that provides a screen, with which users can interact in order to do something whereas a Fragment represents a behavior or a portion of user interface in an Activity."

                ,"When there are ui components that are going to be used across multiple activities.\n" +
                "When there are multiple views that can be displayed side by side (viewPager tabs)\n" +
                "When you have data that needs to be persisted across Activity restarts (such as retained fragments)"

                ,"replace removes the existing fragment and adds a new fragment. This means when you press back button the fragment that got replaced will be created with its onCreateView being invoked.\n" +
                "add retains the existing fragments and adds a new fragment that means existing fragment will be active and they wont be in ‘paused’ state hence when a back button is pressed onCreateView is not called for the existing fragment(the fragment which was there before new fragment was added)."

                ,"The reason why you should be passing parameters through bundle is because when the system restores a fragment (e.g on config change), it will automatically restore your bundle. This way you are guaranteed to restore the state of the fragment correctly to the same state the fragment was initialised with."

                ,"We need to save each Fragment transaction to the backstack, by calling addToBackStack() before you commit() that transaction"

                ,"addOnBackStackChangedListener is called when fragment is added or removed from the backstack."

                ,"By default, Fragments are destroyed and recreated along with their parent Activity’s when a configuration change occurs. Calling setRetainInstance(true) allows us to bypass this destroy-and-recreate cycle, signaling the system to retain the current instance of the fragment when the activity is recreated."

                ,"FragmentPagerAdapter: the fragment of each page the user visits will be stored in memory, although the view will be destroyed. So when the page is visible again, the view will be recreated but the fragment instance is not recreated. This can result in a significant amount of memory being used. FragmentPagerAdapter should be used when we need to store the whole fragment in memory. FragmentPagerAdapter calls detach(Fragment) on the transaction instead of remove(Fragment).\n" +
                "FragmentStatePagerAdapter: the fragment instance is destroyed when it is not visible to the User, except the saved state of the fragment. This results in using only a small amount of Memory and can be useful for handling larger data sets. Should be used when we have to use dynamic fragments, like fragments with widgets, as their data could be stored in the savedInstanceState.Also it won’t affect the performance even if there are large number of fragments."

                ,"Android Toast can be used to display information for the short period of time. A toast contains message to be displayed quickly and disappears after sometime."

                ,"Loader API was introduced in API level 11 and is used to load data from a data source to display in an activity or fragment. Loaders persist and cache results across configuration changes to prevent duplicate queries."
                ,"A fragment that displays a dialog window, floating on top of its activity’s window. This fragment contains a Dialog object, which it displays as appropriate based on the fragment’s state. Dialogs are entirely dependent on Activities. If the screen is rotated, the dialog is dismissed. Dialog fragments take care of orientation, configuration changes as well."
                ,"View: View objects are the basic building blocks of User Interface(UI) elements in Android. View is a simple rectangle box which responds to the user’s actions. Examples are EditText, Button, CheckBox etc\n"+"ViewGroup: ViewGroup is the invisible container. It holds View and ViewGroup. For example, LinearLayout is the ViewGroup that contains Button(View), and other Layouts also. ViewGroup is the base class for Layouts."
                ,"It is one of a resizable bitmap resource which is being used as backgrounds or other images on the device. The NinePatch class allows drawing a bitmap in nine sections. The four corners are unscaled; the middle of the image is scaled in both axes, the four edges are scaled into one axis."
                ,"Linear Layout — Arranges elements either vertically or horizontally. i.e. in a row or column.\n" + "Relative Layout — Arranges elements relative to parent or other elements."
                ,"It allows you to create large and complex layouts with a flat view hierarchy (no nested view groups). It’s similar to RelativeLayout in that all views are laid out according to relationships between sibling views and the parent layout, but it’s more flexible than RelativeLayout and easier to use with Android Studio’s Layout Editor."
                ,"Frame Layouts are designed to contain a single item, making them an efficient choice when you need to display a single View."
                ,"An adapter responsible for converting each data entry into a View that can then be added to the AdapterView (ListView/RecyclerView)."
                ,"Create a flexible layout — The best way to create a responsive layout for different screen sizes is to use ConstraintLayout as the base layout in your UI. ConstraintLayout allows you to specify the position and size for each view according to spatial relationships with other views in the layout. This way, all the views can move and stretch together as the screen size changes.\n" +
                "Create stretchable nine-patch bitmaps\n" +
                "\nAvoid hard-coded layout sizes — Use wrap_content or match_parent. \nCreate alternative layouts — The app should provide alternative layouts to optimise the UI design for certain screen sizes. For eg: different UI for tablets\n" +
                "Use the smallest width qualifier — For example, you can create a layout named main_activity that’s optimised for handsets and tablets by creating different versions of the file in directories as follows:\n\n" +
                "res/layout/main_activity.xml — For handsets (smaller than 600dp available width)\n" +
                "res/layout-sw600dp/main_activity.xml — For 7” tablets (600dp wide and bigger).\n" +
                "The smallest width qualifier specifies the smallest of the screen’s two sides, regardless of the device’s current orientation, so it’s a simple way to specify the overall screen size available for your layout."
                ,"An ANR dialog appears when your UI has been unresponsive for more than 5 seconds, usually because you’ve blocked the main thread. To avoid encountering ANR errors, you should move as much work off the main thread as possible."

                ,"A singleton class is a class which can create only an object that can be shared all other classes."
                ,"commit() writes the data synchronously and returns a boolean value of success or failure depending on the result immediately.\n" +
                "apply() is asynchronous and it won’t return any boolean response. Also if there is an apply() outstanding and we perform another commit(). The commit() will be blocked until the apply() is not completed."
                ,"RecyclerView is designed to display long lists (or grids) of items. Say we want to display 100 row of items. A simple approach would be to just create 100 views, one for each row and lay all of them out. But that would be wasteful because at any point of time, only 10 or so items could fit on screen and the remaining items would be off screen. So RecyclerView instead creates only the 10 or so views that are on screen. This way you get 10x better speed and memory usage."
                ,"ViewHolder Pattern:\n Recyclerview implements the ViewHolders pattern whereas it is not mandatory in a ListView. A RecyclerView recycles and reuses cells when scrolling.\n"+"LayoutManager:\n In a ListView, the only type of view available is the vertical ListView. A RecyclerView decouples list from its container so we can put list items easily at run time in the different containers (linearLayout, gridLayout) by setting LayoutManager.\n" +
                "Item Animator:\n ListViews are lacking in support of good animations, but the RecyclerView brings a whole new dimension to it."
                ,"MVC is the Model-View-Controller architecture where model refers to the data model classes. The view refers to the xml files and the controller handles the business logic. The issue with this architecture is unit testing.\n"+"MVP architecture: Model-View-Presenter architecture. The View includes the xml and the activity/fragment classes. So the activity would ideally implement a view interface making it easier for unit testing.\n"+"MVVM: Model-View-ViewModel Architecture. The Model comprises data, tools for data processing, business logic. The View Model is responsible for wrapping the model data and preparing the data for the view."
                ,"it is fully qualified pacakage name for the application and also use for tracking of the application"
                ,"This is a method that begins the animation process of a view object by calling the AnimationUtils class utilities to accesss the resource necessary to load the animation."
                ,"A software developement process that relies on the repition of a very short development cycle: in the first  an automated test case  is written that defines a desired improvement of new functionality"
                ,"Sensors that are not physicall present on the device. They are derived from one or more sensors."
                ,"The NotificationManager class is used to display notifications on the device's status bar."
                ,"GPS"
        };




        listViewDemo = (ListView) findViewById(R.id.listView);
        interview_QA.ListViewAdapter adapter = new interview_QA.ListViewAdapter(getApplicationContext(), listItemDemo);
        listViewDemo.setAdapter(adapter);

        builder = new AlertDialog.Builder(interview_QA.this);
        listViewDemo.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                // TODO Auto-generated method stub
//                view.setBackgroundColor(Color.YELLOW);

                String ques = (String) adapter.getItem(position);
                int i=position;
                builder.setTitle(ques); // set Title
                builder.setMessage(answer[i]);  // set message
                builder.setCancelable(true);

                if ((alertDialog == null) || !alertDialog.isShowing()){
                    alertDialog = builder.create();
                    alertDialog.show();
                }


            }
        });
    }

    class ListViewAdapter extends ArrayAdapter {

        String[] que;

        public ListViewAdapter(Context context, String[] question) {
            super(context, R.layout.custom_list_for_interview_qa, R.id.question, question);
            this.que = question;
        }

        public View getView(int position, View convertView, ViewGroup parent) {
            LayoutInflater inflater = (LayoutInflater) getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            View row = inflater.inflate(R.layout.custom_list_for_interview_qa, parent, false);

            TextView mtext = row.findViewById(R.id.question);
            mtext.setText(que[position]);
            return row;
        }
    }



    @Override
    public boolean onSupportNavigateUp() {
        if (getFragmentManager().getBackStackEntryCount() > 0) {
            getFragmentManager().popBackStack();
        } else {
            super.onBackPressed();
        }
        return true;
    }
}