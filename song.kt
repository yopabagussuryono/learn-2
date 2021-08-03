fun main() {

    /*

    1. variabel song use type data String have values output "song"
    2. varibel title use type data String have values output "just the two of us"
    3. variabel fullsong use type String take values output from variabel song and title
    4. print result output from variabel fullsong
     */
    val song: String = "Song: "
    val title: String = "Just the two of us"
    val fullsong: String = song + title
    println(fullsong)

    /*

    1. variabel artist use type data String have values output "Artists"
    2. varibel name use type data String have values output "Grover Washington, Jr., Bill Withers"
    3. variabel fullname use type String take values output from artist song and name
    4. print result output from variabel fullname
     */

    val artist: String = "Artists: "
    val name: String = "Grover Washington, Jr., Bill Withers"
    val fullname: String = artist + name
    println(fullname)

    /*

    1. variabel album use type data String have values output "Album"
    2. varibel namealbum use type data String have values output "Winelight"
    3. variabel fullalbum use type String take values output from artist album and namealbum
    4. print result output from variabel fullalbum
     */

    val album: String = "Album: "
    val namealbum: String = "Winelight"
    val fullalbum: String = album + namealbum
    println(fullalbum)

    /*

    1. variabel release use type data Integer have values output number 1970 and use declaration 'var' because values output will get arithmetic process
    2. declaration varibel and make declaration process
    3. variabel orirelease use type String have values output "release: " and take values output variabel release after arithmatic process
    4. print result output from variabel orirelease
     */

    var release: Int = 1970
//    val releaseyear: Int = release +10
    release += 10
    val orirelease: String = "release: " + release
//    val orirelease: String = "release: " + releaseyear
    println(orirelease)

    /*

    1. variabel duration use type data Doble for declaration values output decimal "3.18"
    2. varibel namealbum use type data String have values output "Winelight"
    3. variabel fullalbum use type String take values output from artist album and namealbum
    4. print result output from variabel fullalbum
     */

    val duration: Double = 3.18
    val timeduration: String = "Duration video: "
    val durationvideo: String = timeduration + duration + "minute"
    println(durationvideo)

    /*

    1. variabel view use type data Float use declaration 'var' for arithmatic have values output decimal + f(identity type data Float)
    2. declaration variabel view for aritmathic process
    3. variabel viewers use type String output values "youtube official video: ", ""viewers and take values output from variabel view after arithmatic process
    4. print result output from variabel viewers
     */

    var view: Float = 4.519157F
    view += 4.519157F
    val viewers: String = "youtube official video: " + view + "viewers"
    println(viewers)

    /*

    1. variabel grades use type data Char for declaration one character
    2. variabel grad use type data String output values "Grades Music: " and take values output from varibel grades
    3. print result output from variabel grad

     */

    val grades: Char = 'A'
    val grad: String = "Grades Music: " + grades
    println(grad)

    /*

    1. variabel isgood use type data Boolean to give condition values output true
    2. variabel isbad use type data Boolean to give condition values output false
    3. variabel examp use type data String output values "Music good: " and take values output condition from variabel isgood
    4. variabel examp2 use type data String output values "Music good: " and take values output condition from variabel isbad plus inverse to make different result
    5. print result output from variabel examp
    6. print result output from variabel examp2

     */

    val isgood: Boolean = true
    val isbad: Boolean = false
    val examp: String = "Music good: " + isgood
    val examp2: String = "Music good: " + !isbad

    println(examp)
    println(examp2)


}
