#! /usr/bin/perl
#usage detectNone-AsciiFile.perl folder
#this script will try all the files in the folder and search for the fisrt none-ascii string in the file
#    my($content, $length);

#open(FILE, "< test.txt") || die "Unable to open file small. <$!>\n";
#@files=Dir.glob( "$ARGV[0]");
@files=<$ARGV[0]/*>;
foreach $file (@files) {
$j=0;
    open(FILE, "< $file") || die "Unable to open file $file . <$!>\n";
    while( chomp($content = <FILE>) ) {
$j++;
    	$length = length($content);
    
    	for( $i = 0; $i < $length; $i++ ) {
     
    	    if( ord(substr($content, $i, 1)) > 127 )
    	    {
    	        print "none ascii founded in $file: line$j:\'$content\'\n";
    	        last;
    	    }        
    	}
    }
 }

close(FILE);

exit 0
