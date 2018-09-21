//Soma
(defn soma [x y] (+ x y)

//Subtracao
(defn subtracao [x y] (- x y)

//Multiplicacao
(defn multiplicacao [x y] (* x y)

//Divisao
(defn divisao [x y] (/ x y)

//Média de dois números
(defn media [x y] (/ (+ x y) 2))

//Raiz quadrada
(defn raizquadrada [x x] (/ (* x x))

//Raiz cubica
(defn raizcubica [x x] (* (* x x) x))

//Log base 10
(defn logaritmobase10 [n]
  (/ (Math/log n) (Math/log 10)))

//Log base 2
(defn logaritmobase2 [n]
  (/ (Math/log n) (Math/log 2)))

//ln
(defn logaritmonatural [n]
  (/ (Math/log n) (Math/log (Math/E))))

//Seno
defn seno [a]
 (Math/sin a)

//Cosseno
defn cosseno [a]
 (Math/cos a)

//Tangente
defn tangente [a]
 (Math/tan a)


