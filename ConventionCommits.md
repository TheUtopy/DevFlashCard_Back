# Conventions de travail

## Type du commit
Le type nous informe du type de commit. 9 types sont disponibles :

build : changements qui affectent le système de build ou des dépendances externes (npm, make…)

ci : changements concernant les fichiers et scripts d’intégration ou de configuration (Travis, Ansible, BrowserStack…)

feat : ajout d’une nouvelle fonctionnalité

fix : correction d’un bug

perf : amélioration des performances

refactor : modification qui n’apporte ni nouvelle fonctionalité ni d’amélioration de performances

style : changement qui n’apporte aucune alteration fonctionnelle ou sémantique (indentation, mise en forme, ajout d’espace, renommante d’une variable…)

docs : rédaction ou mise à jour de documentation

test : ajout ou modification de tests

À cela s’ajoute revert. Ce dernier permet comme son nom l’indique, d’annuler un précédent commit.

## Le sujet
Le sujet contient une description succinte des changements. En général, on se limite à 50 caractères. De nombreux outils avertissent d’ailleurs lorsque l’on dépasse la longueur maximale.

Pour adopter un style descriptif efficace, on utilise l’impératif présent : add, change, update, remove et non pas changed ou removed. add caching for better performance par exemple.