# CheckedTextView


## Table of Contents
* [Introduction](#Introduction)
* [History](#History)
* [Major Methods/Attributes](#Methods_Attributes)
* [Example Project](#Example_Project)
* [Reference](#Reference)



## <a name="Introduction">Introduction</a>

<p>The CheckedTextView is a combination of a TextView as well as a CheckBox that impliments the checkable interface. Allowing the application to display text to a user and prompting them to click the checkbox in order to change settings, remember a password, or sign up to be added to a email list, these are just some examples the developers could use it for </p>



## <a name="History">History</a>

Accoring to Microsoft the CheckedTextView Class was introduced early on in android API 1. Included in the android.widget.CheckedTextView package

## <a name="Methods_Attributes">Major Methods/Attributes</a>

<h3> Methods</h3>

**isChecked()** This medthod returns a boolean of true or false allowing you to make decidions programatically, weather the user clicked the checkbox or hasent clicked it.

**setCheckMarkDrawable(int resID)** This method allows the developer to use a custom image specified from the drawable folder.

**setChecked(boolean checked)** The setChecked method allows the developer to set the state of the checkbox. This can be helpful when loading the users preferences.

**toggle()** The toggle method allows the CheckedTextView to change the checked state to the inverse state.

**setOnClickListener** This is used to detect when the CheckTextView has been clicked, usually used to toggle the checkbox.

<h3> XML Attributes</h3>

**android:checkMark** This allows the developer to define the Drawable image that should be used for the check mark graphic.

**android:checked** This allows the developer to set the intial state of the checkbox.

**android:checkMarkTint** This allows the developer to set a tint to the checkmark generally a colour specified in RGB.

**android:checkMarkTint**

## <a name="Example_Project">Example Project</a>

**Overview of the app and functionality**
The app I created for this assignment was a simple login screen with the purpose of using the ChckedTextView to save the users email when they click the check box. This application has two TextViews, one for email, the second for password. The app also has a login button (note this button does actually log users in) and lastly the checkedTextView that is used if the user wants to keep their email saved when they close the app and come back next time.

![app](https://github.com/getLiauba/CheckedTextView/blob/master/Images/appimage.png?raw=true)


**Major Methods used**

When first adding the CheckedTextView to the main activity, the first major attribute I had to use was the android:checkMark
I set it equal to "?android:attr/listChoiceIndicatorMultiple" alternativly, listChoiceIndicatorSingle could have been used to have a circular checkbox.

The second attribute I used was android:text in order to set the text of the CheckedTextView to "Check to save Email".

![Attribute](https://github.com/getLiauba/CheckedTextView/blob/master/Images/CheckMArk.png?raw=true)

The third method used was the setOnClickListener() this was used in order to determine when the user has click the CheckedTextView
![setOnClick](https://github.com/getLiauba/CheckedTextView/blob/master/Images/SetOnClickListener.png?raw=true)

The fourth method used was the isChecked() inside of the setOnClickedListener, This was used in order to determine if the checkbox has already been checked 
![inChecked](https://github.com/getLiauba/CheckedTextView/blob/master/Images/isChecked.png?raw=true)

The fifth method used was the setChecked(false) this was used in order to uncheck the checkbox if the user had clicked it when it was already checked. Alternativly the toggle() method could have been used.
![setChecked](https://github.com/getLiauba/CheckedTextView/blob/master/Images/setChecked.png?raw=true)

The sixth method used was the toggle() method this was in order to check the CheckedTextView checkbox if it was not previously checked. Alternativly the setChecked(true) method could have been used to achieve the same results

![Toggle](https://github.com/getLiauba/CheckedTextView/blob/master/Images/toggle.png?raw=true)





## <a name="Reference">Reference</a>

https://docs.microsoft.com/en-us/dotnet/api/android.widget.checkedtextview?view=xamarin-android-sdk-9

























