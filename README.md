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

<h3> XML Attributes</h3>

**android:checkMark** This allows the developer to define the Drawable image that should be used for the check mark graphic.

**android:checked** This allows the developer to set the intial state of the checkbox.

**android:checkMarkTint** This allows the developer to set a tint to the checkmark generally a colour specified in RGB.



## <a name="Example_Project">Example Project</a>

## <a name="Reference">Reference</a>

https://docs.microsoft.com/en-us/dotnet/api/android.widget.checkedtextview?view=xamarin-android-sdk-9
