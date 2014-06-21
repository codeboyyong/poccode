#! /usr/bin/perl
#usage detectNone-AsciiFile.perl folder
#this script will try all the files in the folder and search for the fisrt none-ascii string in the file
#    my($content, $length);
     open(FILE, "< $ARGV[0]") || die "Unable to open file $1 . <$!>\n";
$j = 0;    
while( chomp($content = <FILE>) ) {
    	$length = length($content);
    $j++;
    	for( $i = 0; $i < $length; $i++ ) {
     
    	    if( ord(substr($content, $i, 1)) > 127 )
    	    {
    	         print "none ascii founded in line $j:\'$content\'\n";
    	        last;
    	    }        
    	}
    }
 

close(FILE);

exit 0
