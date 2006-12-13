#!/usr/bin/perl
use File::Find;
no warnings 'recursion';
##############################################################################
# Define Variables

if ($ARGV[0] eq "-var_trans" or $ARGV[0] eq "-single_multi" or $ARGV[0] eq "-all") { $signal = $ARGV[0];  }
  else { die "Usage:\n   perl convert.pl -var_trans|-single_multi|-all  DIRECTORY\n"; }
if ($ARGV[1] ne "") { $dir = $ARGV[1];  } else { die "Please specify the Directory in which you want to convert .flr files.\n"; }
##############################################################################

$str_question_wrong1='\?STD';
$str_question_back1='STD';
$str_question_wrong2='\?FLORA_';
$str_question_back2='FLORA_';
$str_question_wrong3='\?WRAP_';
$str_question_back3='WRAP_';
$str_question_wrong4='\?_#';
$str_question_back4='_#';
$str_question_wrong5='\?_@';
$str_question_back5='_@';

$str_hash='#';
$str_percent='%';
$str_percent_wrong1='%define';
$str_percent_hash1='#define';
$str_percent_wrong2='%include';
$str_percent_hash2='#include';
$str_percent_wrong3='_%';
$str_percent_hash3='_#';


#$str_question_wrong4='\?SEPARATOR';  in flora-testsuite/apptests/programs/Grade.flr
#$str_question_back4='SEPARATOR';  in flora-testsuite/apptests/programs/Grade.flr
#$str_question_wrong5='\?MODULE';  in flora-testsuite/apptests/programs/Grade.flr
#$str_question_back5='MODULE';  in flora-testsuite/apptests/programs/Grade.flr

#$str_percent_wrong4='%endif';
#$str_percent_hash4='#if';
#$str_percent_wrong5='%else';
#$str_percent_hash5='#else';
#$str_percent_wrong6='%mode';
#$str_percent_hash6='#mode';

$str_0_1='=>>';
$str_0_2='=@huiwan@>';

$str_1_1='(?<!})\*=>';
$str_1_2='{1:1}*=@wanhui@>';
$str_2_1='(?<![}\*])=>';
$str_2_2='{1:1}=>';
$str_3_1='{1:1}\*=@wanhui@>';
$str_3_2='{1:1}*=>';

$str_4_1='=@huiwan@>';
$str_4_2='=>';

$str_5_1='->>';
$str_5_2='->';

$str_6_1='!!';
$str_6_2='!';

$str_7_1='(?<![=\.\ ])\.\.(?=[a-zA-Z\_\?\'\"])';
$str_7_2='.';


&get_dir_list($signal,$dir);
 	
exit;

# ------------------------------------------------------------------------------
sub get_dir_list {
    my ($signal,$dir) = @_;
    my @dirlist = ();

opendir(DIR, "$dir") or die "can't open $dir\n";

while ($entry = readdir(DIR)) {
   if ($entry eq "." || $entry eq "..")  {  next;  }
    
   $type = ( -d "$dir/$entry" ) ? "dir" : "file";
   
   if ($type eq "file" && $entry ne "forum")    {
      $fname = "$dir/$entry";
      &parse_file($signal,$fname);
   }

   if ($type eq "dir" && $entry ne "forum")    {
      $rec_dir = "$dir/$entry";
      print "$type - $entry\n";
      push @dirlist, $rec_dir;
   }   
}

closedir(DIR);

foreach $subdir (@dirlist)

{      &get_dir_list($signal,$subdir);}


}

# ------------------------------------------------------------------------------
sub parse_file {
    my ($signal,$fname) = @_;
    my @cd = split(/\./, $fname);
	
    if ($cd[@cd - 1] eq "flr" 
       ) { 
       my @new_file = "";
       open(FILE, "<$fname") || die "Can't open the file $fname\n";
       my @wholefile=<FILE>;
       my $lines = join '', @wholefile;

       if ($signal eq "-var_trans" or $signal eq "-all")
	 {
	   $lines = &question($lines);
	   $lines =~ s/$str_question_wrong1/$str_question_back1/gm;
	   $lines =~ s/$str_question_wrong2/$str_question_back2/gm;
	   $lines =~ s/$str_question_wrong3/$str_question_back3/gm;
	   $lines =~ s/$str_question_wrong4/$str_question_back4/gm;
	   $lines =~ s/$str_question_wrong5/$str_question_back5/gm;

	   $lines =~ s/$str_hash/$str_percent/gm;
	   $lines =~ s/$str_percent_wrong1/$str_percent_hash1/gm;
	   $lines =~ s/$str_percent_wrong2/$str_percent_hash2/gm;
	   $lines =~ s/$str_percent_wrong3/$str_percent_hash3/gm;
	 }

       if ($signal eq "-single_multi" or $signal eq "-all")
	 {
	   $lines =~ s/$str_0_1/$str_0_2/gm;
	   $lines =~ s/$str_1_1/$str_1_2/gm;
	   $lines =~ s/$str_2_1/$str_2_2/gm;
	   $lines =~ s/$str_3_1/$str_3_2/gm;
	   $lines =~ s/$str_4_1/$str_4_2/gm;
	   $lines =~ s/$str_5_1/$str_5_2/gm;
	   $lines =~ s/$str_6_1/$str_6_2/gm;
	   $lines =~ s/$str_7_1/$str_7_2/gm;
	 }

       close(FILE);
       open(FILE,">$fname") || die "Can't open the file $fname\n";
       print FILE "$lines";
       close(FILE);
   }   
}

# ------------------------------------------------------------------------------
sub question {
    my ($string) = @_;

    my $b1,my $b2;
    my $before, my $comments;
    my $a1, my $a2;
    my $part1, my $part2;

    $part1="";

    while ($string =~ /(\'|\"|\/\*|\/\/)/){
        if ($1 eq "\'") {$b1="\'"; $a2=$b2="\'";}
	if ($1 eq "\"") {$b1="\""; $a2=$b2="\"";}
	if ($1 eq "\/\*") {$b1="\\/\\*"; $b2="\\*\\/"; $a2="\*\/";}
	if ($1 eq "\/\/") {$b1="\\/\\/"; $a2=$b2="\n";}
	$a1 = $1;

	$string =~ m/(.*?)($b1)(.*?)($b2)(.*)/s;

	$comments = $3;
	$before = &question_all($1);

	$part1 = $part1.$before.$a1.$comments.$a2;
	$string = $5;

    }

    $part2 = &question_all($string);
    $part1.$part2;


}
# ------------------------------------------------------------------------------
sub question_all {
    my ($string) = @_;

    $string =~ s/^([A-Z_])/\?$1/gm;
    $string =~ s/([^a-zA-Z0-9_?])([A-Z_])/$1\?$2/g;

    $string;
}
# ------------------------------------------------------------------------------


1;

