@file:Suppress("UNUSED_PARAMETER")
package lesson2.task2


import lesson1.task1.sqr



fun main(args: Array<String>) {
    // val result = angleInRadian(55,45,9)
    //println("angelInRadian=$result")
    /* for (i in 1..200)
     {
         println(ageDescription(i));
     }*/
    // println(timeForHalfWay(5.0,2.0,3.0,4.0,2.0,6.0));
    //val x1x2 = quadraticRootProduct(1.0, 13.0, 42.0)
    //println("Root product: $x1x2")
    //  println(whichRookThreatens(2,8,1,3,9,6))
    //  println(rookOrBishopThreatens(2,1,4,3,7,8))
    //  println(triangleKind(10.0,1.0,1.414213562373095))
  //  println(isNumberHappy(1506))
  //  println(queenThreatens(1,1,2,2))
  //  println("Days in the month: "+daysInMonth(9,1964))
    //println("Circle inside: "+circleInside(6.0,6.0,10.0,5.0,5.0,10.0))
    println("brickPasses:" +brickPasses(10,5,2,4,10))
}
/**
 * Пример
 *
 * Лежит ли точка (x, y) внутри окружности с центром в (x0, y0) и радиусом r?
 */
fun pointInsideCircle(x: Double, y: Double, x0: Double, y0: Double, r: Double) =
        sqr(x - x0) + sqr(y - y0) <= sqr(r)

/**
 * Простая
 *
 * Четырехзначное число назовем счастливым, если сумма первых двух ее цифр равна сумме двух последних.
 * Определить, счастливое ли заданное число, вернуть true, если это так.
 */
fun isNumberHappy(number: Int): Boolean  {
    var str = (number).toString()
    println("String is:" + str)
    println(str.substring(1,2))
   if (str.substring(0,1).toDouble()+str.substring(1,2).toDouble() ==
           str.substring(2,3).toDouble()+str.substring(3,4).toDouble() ) return true
    else return false
}

/**
 * Простая
 *
 * На шахматной доске стоят два ферзя (ферзь бьет по вертикали, горизонтали и диагоналям).
 * Определить, угрожают ли они друг другу. Вернуть true, если угрожают.
 * Считать, что ферзи не могут загораживать друг друга.
 */
fun queenThreatens(x1: Int, y1: Int, x2: Int, y2: Int): Boolean {


    if ((x1 == x2 || x1 == y2 || y1 == x2 || y1 == y2)) return true
    if ((x1 + y1 == x2 + y2) || (x1 - y1 == x2 - y2)) return true
    else return false
}


/**
 * Простая
 *
 * Дан номер месяца (от 1 до 12 включительно) и год (положительный).
 * Вернуть число дней в этом месяце этого года по григорианскому календарю.
 */
fun daysInMonth(month: Int, year: Int): Int {
    val set = listOf(1,3,5,7,8,10,12);
    println(year%4);
   if (year%4==0&& month==2) return 29
    if (month==2) return 28
    else if (set.firstOrNull { it==month } != null) return 31
    else return 30
}

/**
 * Средняя
 *
 * Проверить, лежит ли окружность с центром в (x1, y1) и радиусом r1 целиком внутри
 * окружности с центром в (x2, y2) и радиусом r2.
 * Вернуть true, если утверждение верно
 */
fun circleInside(x1: Double, y1: Double, r1: Double,
                 x2: Double, y2: Double, r2: Double): Boolean {
    //Окружность 2 будет внутри окружности 1, если
    //R1*R1>(a1-a2)*(a1-a2)+(b1-b2)*(b1-b2)+R2*R2
    if (r2*r2 >(x2-x1)*(x2-x1)+(y2-y1)*(y2-y1)+r1*r1) return true
    else return false;
}

/**
 * Средняя
 *
 * Определить, пройдет ли кирпич со сторонами а, b, c сквозь прямоугольное отверстие в стене со сторонами r и s.
 * Стороны отверстия должны быть параллельны граням кирпича.
 * Считать, что совпадения длин сторон достаточно для прохождения кирпича, т.е., например,
 * кирпич 4 х 4 х 4 пройдёт через отверстие 4 х 4.
 * Вернуть true, если кирпич пройдёт
 */
fun brickPasses(a: Int, b: Int, c: Int, r: Int, s: Int): Boolean {


    when{
        (a<=r && b<=s) ||(a<=s && b <= r) -> return true
        (c<=r && b<=s) ||(c<=s && b <= r) -> return true
        (a<=r && c<=s) ||(a<=s && c <= r) -> return true
        else -> return false
     }

}