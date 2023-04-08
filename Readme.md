### First Kotlin Project (Android Development)
#### MPOP Reverse II (Ryann Kim Sesgundo)
---
### Introduction
> It is just a scratch program where I want to explore kotlin for some reasons. In this way, may I use Java and Kotlin in terms of android development. Big credits to my college school to allow me to have android studio on my device from one of their professors.
---
### Adjustements and some conversions
> I use this kind of method in Java
```Java
class MainActivity extends Activity{
    @Override
    public void onCreate(Bundle bundle){
        super.onCreate(bundle);
        LinearLayout base = new LinearLayout(this);
        // ...
        setContentView(base);
    }
}
```
> This process is what I called `Params Method` or a method of avoiding the use of `XML` for creating some layouts. In this way, we may avoid the modifications of the application from the layout up to its design. But in `Kotlin` I use this kind of method now.
```Kotlin
class MainActivity : Activity() {
    override fun onCreate(bundle: Bundle?){
        super.onCreate(bundle)
        val base = LinearLayout(this)
        // ...
        setContentView(base)
    }
}
```
> It almost look like the java, but it make some adjustments for me. Another one is by using a context into an interface.
```Java
button.setOnClickListener(new OnClickListener(){
    @Override
    public void onClick(View v){
        AlertDialog.Builder alert = new AlertDialog.Builder(MainActivity.this);
    }
})
```
> But in Kotlin, it looks like this
```Kotlin
button.setOnClickListener(object: OnClickListener{
    override fun onClick(v: View){
        val alert = new AlertDialog.Builder(this@MainActivity);
    }
})
```
> So to have this solution, I'd asked to the internet, but later on, I use the auto complete hint in android studio.