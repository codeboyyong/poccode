#seq 1 10000  alos can do this
while [[ $cnt -lt 10000 ]]; do  echo "* $RANDOM";  cnt=$(( $cnt + 1 ));  if [[ $cnt -gt 10000 ]] ; then       break;  fi; done | bc -l