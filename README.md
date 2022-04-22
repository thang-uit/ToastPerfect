# ToastPerfect Android Library

## Description
    ToastPerfect help you display Toast library for Android more beautiful and professional.
    The library provides 4 common simple toast messages (Success, Error, Warning and Information).
    I'm create this library with the purpose of improving user interface and helping me save development time.


Usage
-----

**MainActivity.java**

```java
// Easy to display Toast
ToastPerfect.makeText(this, ToastPerfect.SUCCESS, "Today is a beautiful day!", ToastPerfect.BOTTOM, ToastPerfect.LENGTH_SHORT).show();
```

**Toast Messages Available into the Library**

The library provides 4 common simple toast messages (Success, Error, Warning and Information). The table below shows a complete example with its pictures.
| Toast | Picture |
| ------------- | ------------- |
| `ToastPerfect.makeText(this, ToastPerfect.SUCCESS, "Today is a beautiful day!", ToastPerfect.BOTTOM, ToastPerfect.LENGTH_SHORT).show();` | <img src="images/UI/ToastSuccess.png" width="100%"></img>  |
`ToastPerfect.makeText(this, ToastPerfect.ERROR, "Today is a beautiful day!", ToastPerfect.BOTTOM, ToastPerfect.LENGTH_SHORT).show();` | <img src="images/UI/ToastError.png" width="100%"></img>  |
`ToastPerfect.makeText(this, ToastPerfect.WARNING, "Today is a beautiful day!", ToastPerfect.BOTTOM, ToastPerfect.LENGTH_SHORT).show();` | <img src="images/UI/ToastWarning.png" width="100%"></img>  |
`ToastPerfect.makeText(this, ToastPerfect.INFORMATION, "Today is a beautiful day!", ToastPerfect.BOTTOM, ToastPerfect.LENGTH_SHORT).show();` | <img src="images/UI/ToastInformation.png" width="100%"></img>  |

3 Position Display
| Position |
| ToastPerfect.TOP | ToastPerfect.CENTER | ToastPerfect.BOTTOM |
|---|---|---|
|<img src="images/Position/ToastTop.png" width="100%"></img>|<img src="images/Position/ToastCenter.png" width="100%"></img>|<img src="images/Position/ToastBottom.png" width="100%"></img>|